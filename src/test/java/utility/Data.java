package utility;

public class Data {
	
	public String getExelData(int row, int cell)
	{
		String data=    getRow(row).getCell(cell);
		return data;
	}

}