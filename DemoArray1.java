class DemoArray1{
	public static String getdata(){
		return "Guru";
	}
	
	public static void main(String[] args){
	String[] studName = new String[2];
	studName[0] = "Vicky";
	studName[1] = getdata();
	System.out.println(studName[0] + "  " + studName[1]);
	}
}
