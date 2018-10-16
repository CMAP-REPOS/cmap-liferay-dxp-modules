<%@ include file="/init.jsp" %>

<portlet:defineObjects />
<portlet:resourceURL var="ajaxCallResourceURL" />

<!-- BEGIN glossary-utility-portlet -->
<script type="text/javascript">
AUI().ready(
  function () {
    var cmap = cmap || {};
    cmap.glossary = cmap.calendar || {};
    cmap.glossary.resourceUrl = '<%= ajaxCallResourceURL %>';

    cmap.glossary.createGlossaryItem = function(term, def, el){
      var hash = term.toLowerCase().replace(/[^a-z]/g, '-');
      var max_length = 100;

      var final_def = def;
      if(def.length > max_length){
        final_def = def.substring(0,max_length);
        final_def += '...';
        final_def += '<br/>';
        final_def += '<a class="backlink" href="/2050/glossary#'+term.toLowerCase().replace(/ /g, '-')+'" target="_blank">Read More</a>';
      }

      var $term = $("<div class='glossary-term'>"+
        "<div class='term-name'>"+term+"</div>"+
        "<div class='term-definition-container'>"+
          "<div class='term-definition'><span class='sr-only'>(</span>"+final_def+"<span class='sr-only'>)</span></div>"+
          "<div class='term-down-arrow'></div>"+
          "<svg class='term-close' width='20' height='20' viewBox='0 0 50 50'><path d='M34.64,32.89L26.75,25l7.88-7.88c0.48-0.48,0.48-1.27,0-1.75c-0.48-0.48-1.27-0.48-1.75,0L25,23.25l-7.88-7.88 c-0.48-0.48-1.27-0.48-1.75,0c-0.48,0.48-0.48,1.27,0,1.75L23.25,25l-7.88,7.88c-0.48,0.48-0.48,1.27,0,1.75 C15.6,34.88,15.92,35,16.24,35s0.63-0.12,0.88-0.36L25,26.75l7.89,7.89c0.24,0.24,0.56,0.36,0.88,0.36c0.32,0,0.63-0.12,0.88-0.36 C35.12,34.15,35.12,33.37,34.64,32.89z'/></svg>"+
        "</div>"+
      "</div>");

      $term.find('.term-name').hover(function(){
        $('.glossary-term').removeClass('active');
        $term.addClass('active');
      }, function(){ });

      $term.find('.term-close').click(function(){
        $term.toggleClass('active');
      });

      el.replaceWith($term);
    }

    cmap.glossary.linkGlossaryItem = function (term, link) {
      $.ajax({
        url: cmap.glossary.resourceUrl,
        data: {
          '<portlet:namespace />cmd': 'getGlossaryItem',
          '<portlet:namespace />term': term
        }
      })
      .done(function(data){
        cmap.glossary.createGlossaryItem(term, data, link);
      })
      .fail(function(error){
        alert('Error, see /modules/glossary-utility-portlet/src/main/resources/META-INF/resources/view.jsp');
      });
    }
    
    $("a[href$='/2050/glossary'],[href$='/2050/glossary']").each(function (i, e) {

      if($(this).is($(".related-recommendation a"))){ return; }
      if($(this).text().trim().toLowerCase() === 'glossary'){ return; }

      cmap.glossary.linkGlossaryItem($(e).text(), $(e));
    }); 
  }
);

</script>
<!-- END glossary-utility-portlet -->
