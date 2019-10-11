package com.cmap.portlets.twitter.api.service.util;

import com.cmap.portlets.twitter.api.service.portlet.SocialSliderSocialMediaPost;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SocialMediaPostDateComparator extends OrderByComparator<SocialSliderSocialMediaPost> {

    public static final String ORDER_BY_ASC = "SocialSliderSocialMediaPost.date ASC";

    public static final String ORDER_BY_DESC = "SocialSliderSocialMediaPost.date DESC";

    public static final String[] ORDER_BY_FIELDS = {"date"};


    public SocialMediaPostDateComparator() {
        this(false);
    }


    public SocialMediaPostDateComparator(boolean ascending) {
        _ascending = ascending;
    }

    @Override
    public int compare(SocialSliderSocialMediaPost arg0, SocialSliderSocialMediaPost arg1) {
        String dateString0 = arg0.getDate();
        String dateString1 = arg1.getDate();

        Date date0 = null;
        Date date1 = null;
        try {
            date0 = new SimpleDateFormat("MMMM d, yyyy").parse(dateString0);
            date1 = new SimpleDateFormat("MMMM d, yyyy").parse(dateString1);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int value = date0.compareTo(date1);

        if (_ascending) {
            return value;
        }
        else {
            return -value;
        }
    }

    @Override
    public String getOrderBy() {
        if (_ascending) { return ORDER_BY_ASC; }
        else { return ORDER_BY_DESC; }
    }

    @Override
    public String[] getOrderByFields() {
        return ORDER_BY_FIELDS;
    }

    @Override
    public boolean isAscending() {
        return _ascending;
    }

    private final boolean _ascending;
}
