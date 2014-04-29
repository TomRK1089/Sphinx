package com.atomiccomics.survey.common;

import com.atomiccomics.survey.core.Question;
import com.atomiccomics.survey.core.VisiblePredicate;

public class Instructions implements Question {

	private final VisiblePredicate delegate;
	
	private final String id;
	
	private final String text;
	
	public Instructions(final String id, final VisiblePredicate delegate, final String text) {
		this.id = id;
		this.delegate = delegate;
		this.text = text;
	}
	
	@Override
	public boolean isVisible() {
		return delegate.isVisible();
	}

	@Override
	public String id() {
		return id;
	}
	
	public String getText() {
		return text;
	}

}