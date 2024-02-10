package Genericlibriary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	
	//get the data from cell wise
	public static String getCellData(String sheetName,int rowNum, int cellNum)  throws EncryptedDocumentException, IOException {
//		//Step 1: Get the java representation of physical file
		FileInputStream fis=new FileInputStream(FrameWorkConstants.EXCELCELLDATA_Path);
		
		//Step 2: Create a workbook

        Workbook workBook = WorkbookFactory.create(fis);
		
		
		//Step 3: Get the sheet from the work book
		Sheet sheet=workBook.getSheet("Registersheet");
		
		//Step 4: Get the row from the sheet

        Row row = sheet.getRow(rowNum);
		
		//Step 5: Get the cell from the given row
		Cell cell=row.getCell(cellNum);
		
		String data=cell.getStringCellValue();
		
		return data;
	}
	
	// get the data from row wise
	public static String[][] getRowData(String sheetName) throws EncryptedDocumentException, IOException{
		//Step 1: 
				FileInputStream fis=new FileInputStream(FrameWorkConstants.EXCELROWDATA_Path);
				
				//Step 2:
				Workbook workBook=WorkbookFactory.create(fis);
				
				//Step 3:
				Sheet sheet=workBook.getSheet("Registersheet");
				
				//Step 4:
				int rowCount=sheet.getPhysicalNumberOfRows();
				
				//Step 5:
				int columnCount=sheet.getRow(0).getPhysicalNumberOfCells();
				 
				String[][] data=new String[rowCount-1][columnCount];
				
				for(int i=1;i<rowCount;i++) {
					for(int j=0;j<columnCount;j++) {
						data[i-1][j]=sheet.getRow(i).getCell(j).toString();
					}
				}
				
				
				 return data;
	}
	}

