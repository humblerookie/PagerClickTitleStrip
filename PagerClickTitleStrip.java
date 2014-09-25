/*******************************************************************************
 * @author Anvith Bhat
 * <b>Feel free to use and fork ;) </b>
 * *******************************************************************************/
package com.widgets;

import android.content.Context;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

public class PagerClickTitleStrip extends PagerTitleStrip {
	private TextView mTextPrev, mTextNext;
	private ViewPager mViewPager;

	public PagerClickTitleStrip(Context arg0, AttributeSet arg1) {
		super(arg0, arg1);

		mTextPrev = (TextView) getChildAt(0);// This is the previous textview
		mTextNext = (TextView) getChildAt(2);// This is the next textview
		mTextPrev.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (mViewPager != null && mViewPager.getCurrentItem() != 0)
					mViewPager.setCurrentItem(mViewPager.getCurrentItem() - 1);
			}
		});
		mTextNext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (mViewPager != null
						&& mViewPager.getCurrentItem() != mViewPager
								.getAdapter().getCount() - 1)
					mViewPager.setCurrentItem(mViewPager.getCurrentItem() + 1);
			}

		});

		invalidate();
	}

	public ViewPager getViewPager() {
		return mViewPager;
	}

	public void setViewPager(ViewPager vPager) {
		this.mViewPager = vPager;
	}

}
