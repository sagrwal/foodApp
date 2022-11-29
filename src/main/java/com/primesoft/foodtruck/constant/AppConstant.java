package com.primesoft.foodtruck.constant;

public class AppConstant {
	public static final String EMPTY_STR ="";


	private AppConstant() {
		throw new IllegalStateException("Utility class");
	}
		//Order
		public static final String ORD_SAVE_SUCC="ordSaveSucc";
		public static final String ORD_SAVE_FAIL="ordSaveFail";
		public static final String ORD_UPDATE_SUCC ="ordUpdateSucc";
		public static final String ORD_UPDATE_FAIL ="ordUpdateFail";
		public static final String ORD_DELETE_SUCC ="ordDeleteSucc";
		public static final String ORD_DELETE_FAIL ="ordDeleteFail";
		public static final String ORD_FOUND_SUCC ="ordFoundSucc";
		public static final String ORD_FOUND_FAIL ="ordFoundFail";
		
		//Menu
		public static final String ITEM_FOUND_SUCC ="itemFoundSucc";
		public static final String ITEM_FOUND_FAIL ="itemFoundFail";


}
