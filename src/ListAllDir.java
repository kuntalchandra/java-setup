class ListAllDir
{
	public static void main(String args[])
	{
		if (args.length <= 0) {
			System.out.println("No files");
		} else {
			for(int i = 0; i < args.length; i++) {
				System.out.println("File " + i + " - " + args[i]);
			}
		}
	}
}
