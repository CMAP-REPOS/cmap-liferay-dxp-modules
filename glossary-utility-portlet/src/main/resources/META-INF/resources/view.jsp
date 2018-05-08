<%@ include file="/init.jsp" %>

<portlet:defineObjects />
<portlet:resourceURL var="ajaxCallResourceURL" />

<!-- BEGIN glossary-utility-portlet -->
<script type="text/javascript">

AUI().ready(

  function () {
    var cmap = cmap || {};
    cmap.glossary = cmap.calendar || {};
    cmap.glossary.resourceUrl = '<%=ajaxCallResourceURL %>';

    <%-- TODO: configure paths --%>
    var glossaryPath = '/2050/glossary';
    var endnotesPath = '/2050/endnotes';

    cmap.glossary.linkGlossaryItem = function (term, link) {
      $.get(
        cmap.glossary.resourceUrl,
        {
          '<portlet:namespace />cmd': 'getGlossaryItem',
          '<portlet:namespace />term': term
        },
        function (data) {
          var hash = term.toLowerCase().replace(/[^a-z]/g, '-');
          link.attr('href', glossaryPath + '#' + hash)
            .wrap('<dfn class="2050-glossary" title="' + data + '"></dfn>');
        })
    }

    $("a[href$='" + glossaryPath + "'],[href$='" + glossaryPath + "/']").each(function (i, e) {
      cmap.glossary.linkGlossaryItem($(e).text(), $(e));

    });

    $("a[href$='" + endnotesPath + "'],[href$='" + endnotesPath + "/']").each(function (i, e) {
      var urlTitle = Liferay.currentURL.replace('/web/guest', '').replace('/', '');
      $(e).text(i + 1)
        .attr('href', endnotesPath + '#' + urlTitle)
        .wrap('<sup class="2050-endnote"></sup>');
    });
  }
  
);

</script>
<!-- END glossary-utility-portlet -->
