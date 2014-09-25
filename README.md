PagerClickTitleStrip
====================
This is a forked version of the <b>PagerTitleStrip</b> to include swipe on click.
Android <b>PagerTitleStrip</b> lacks click event functionality ,this one adds the same.

<b>Sample Usage:</b>

In the onCreate() of your Activity/Fragment
just set the ViewPager

i.e 
	PagerClickTitleStrip mTitleStrip=(PagerClickTitleStrip)findViewById(R.id.pager_title_strip);
	mTitleStrip.setViewPager(mViewPager);

