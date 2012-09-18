package com.acme.main.client;

import java.util.logging.Logger;

import com.google.gwt.core.client.EntryPoint;

public class Main implements EntryPoint {

	private final Logger logger = Logger.getLogger (getClass ().getName ());

	@Override
	public void onModuleLoad () {

		//replace the following code with the test logic
		logger.warning ("REMOVE ME");

//		//datasource initialization
//		final DataSource dataSource = new DataSource ();
//		{//datasource fields initialization
//			final List<ListGridRecord> testData = new ArrayList<ListGridRecord> ();
//			{
//				final ListGridRecord record = new ListGridRecord ();
//				record.setAttribute ("id", 1);
//				record.setAttribute ("name", "1st record");
//				testData.add (record);
//			}
//			{
//				final ListGridRecord record = new ListGridRecord ();
//				record.setAttribute ("id", 2);
//				record.setAttribute ("name", "2nd record");
//				testData.add (record);
//			}
//			dataSource.setTestData (testData.toArray (new ListGridRecord[0]));
//		}
//		dataSource.setClientOnly (true);
//		{
//			final DataSourceIntegerField dsfId = new DataSourceIntegerField ("id");
//			dsfId.setPrimaryKey (true);
//			dataSource.addField (dsfId);
//			final DataSourceTextField dsfName = new DataSourceTextField ("name");
//
//			dataSource.addField (dsfName);
//		}
//		
//		//UI initialization
//		final ListGrid grid = new ListGrid ();
//		grid.setAutoFetchData (true);
//		grid.setDataSource (dataSource);
//		
//		final VLayout layout = new VLayout ();
//		layout.addMember (grid);
//		layout.setWidth100 ();
//		layout.setHeight100 ();
//		layout.show ();

	}

}
