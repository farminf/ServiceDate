package org.knopflerfish.tutorial.ds.impl;

import java.text.DateFormat;
import java.util.Date;

import org.knopflerfish.tutorial.ds.DS;

public class DateServiceImpl implements DS 
	{
		public String getFormattedDate(Date date) 
		{
			return DateFormat.getDateInstance(DateFormat.SHORT)
					.format(date);
		} 		
	}