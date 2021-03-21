package com.hackp.face;



class SmartWebView {

	/* -- PERMISSION VARIABLES -- */
	static boolean ASWP_JSCRIPT       = true;         // enable JavaScript for webview
	static boolean ASWP_FUPLOAD       = true;         // upload file from webview
	static boolean ASWP_CAMUPLOAD     = true;         // enable upload from camera for photos
	static boolean ASWP_ONLYCAM       = false;        // incase you want only camera files to upload
	static boolean ASWP_MULFILE       = true;         // upload multiple files in webview
	static boolean ASWP_LOCATION      = true;         // track GPS locations
	static boolean ASWP_CP			  = false;		  // enable copy/paste within webview

	static boolean ASWP_RATINGS       = true;         // show ratings dialog; auto configured ; edit method get_rating() for customizations

	static boolean ASWP_PULLFRESH     = true;         // pull refresh current url
	static boolean ASWP_PBAR          = true;         // show progress bar in app
	static boolean ASWP_ZOOM          = false;        // zoom control for webpages view
	static boolean ASWP_SFORM         = false;        // save form cache and auto-fill information
	static boolean ASWP_OFFLINE       = false;        // whether the loading webpages are offline or online
	static boolean ASWP_EXTURL        = true;         // open external url with default browser instead of app webview

	static boolean ASWP_TAB           = true;         // instead of default browser, open external URLs in chrome tab
	static boolean ASWP_ADMOB         = true;         // to load admob or not

	static boolean ASWP_EXITDIAL	  = true;		  // confirm to exit app on back press

	/* -- SECURITY VARIABLES -- */
	static boolean ASWP_CERT_VERI     = true;         // verify whether HTTPS port needs certificate verification


	/* -- CONFIG VARIABLES -- */
	// layout selection
	static int ASWV_LAYOUT            = 0;            // default=0; for clear fullscreen layout, and =1 for drawer layout

	// URL configs
	static String ASWV_URL            = "http://offdeff.hackp.cyberdome.org.in:8090/recognize";     // complete URL of your website or offline webpage
	static String ASWV_SEARCH         = "http://offdeff.hackp.cyberdome.org.in:8090/recognize";       // search query will start by the end of the present string
	static String ASWV_SHARE_URL      = ASWV_URL + "?share=";                     // URL where you process external content shared with the app

	// domains allowed to be opened inside webview
	static String ASWV_EXC_LIST       = "github.com,www.google.com";              //separate domains with a comma (,)

	// to upload any file type using "*/*"; check file type references for more
	static String ASWV_F_TYPE         = "*/*";

	// admob config
	static String ASWV_ADMOB          = "ca-app-pub-9276682923792397~7957851075"; // your unique publishers ID; this one is temporary


	/* -- RATING SYSTEM VARIABLES -- */
	static int ASWR_DAYS      = 3;            // after how many days of usage would you like to show the dialog
	static int ASWR_TIMES     = 10;           // overall request launch times being ignored
	static int ASWR_INTERVAL  = 2;            // reminding users to rate after days interval
}
