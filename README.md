# PagerClickTitleStrip

This is a  simple forked version of the <b>PagerTitleStrip</b> to include swipe on click.
Android <b>PagerTitleStrip</b> lacks click event functionality ,this one adds the same.

### Usage

	 <android.support.v4.view.ViewPager
            xmlns:android="http://schemas.android.com/apk/res/android"
            android:id="@+id/pager"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            >
  
	        <com.widget.PagerClickTitleStrip
	            android:id="@+id/pager_title_strip"
	            android:layout_width="match_parent"
	            android:layout_height="wrap_content"
	            android:layout_alignParentLeft="true"
	            android:layout_alignTop="@+id/pager"
	            android:layout_marginTop="46dp"
	            android:background="@android:color/black"
	            android:paddingBottom="7dp"
	            android:paddingTop="10dp"
	            android:textColor="#cfff" />
            
        </android.support.v4.view.ViewPager>

