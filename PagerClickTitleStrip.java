/*******************************************************************************
 * @author Anvith Bhat
 * <b>Feel free to use and fork ;) </b>
 * *******************************************************************************/
package com.widget;

import android.content.Context;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;

public class PagerClickTitleStrip extends PagerTitleStrip {
	private TextView mTextPrev, mTextNext;
	private ViewPager mPager;

	public PagerClickTitleStrip(Context arg0, AttributeSet arg1) {
		super(arg0, arg1);

		mTextPrev = (TextView) getChildAt(0);// This is the previous textview
		mTextNext = (TextView) getChildAt(2);// This is the next textview
		mTextPrev.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (mPager != null && mPager.getCurrentItem() != 0)
					mPager.setCurrentItem(mPager.getCurrentItem() - 1);
			}
		});
		mTextNext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (mPager != null
						&& mPager.getCurrentItem() != mPager
								.getAdapter().getCount() - 1)
					mPager.setCurrentItem(mPager.getCurrentItem() + 1);
			}

		});

		invalidate();
	}

	@Override
	protected void onAttachedToWindow() {
		super.onAttachedToWindow();
		ViewParent parent = getParent();
	    if (!(parent instanceof ViewPager)) {
	        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
	      }
	    mPager=(ViewPager)parent;
	}

}
