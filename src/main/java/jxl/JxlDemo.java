package jxl;

import org.apache.poi.ss.usermodel.*;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;


public class JxlDemo {
    public static void main(String[] args) throws IOException {
        String file_dir = "C:\\Users\\Administrator\\Desktop\\test.xlsx";
        Workbook book = null;
        book = getExcelWorkbook(file_dir);
        Sheet sheet = getSheetByNum(book,0);
        int lastRowNum = sheet.getLastRowNum();
        //查出最后一行
        Map<Integer,String> map  = new HashMap<Integer, String>();
        for(int i = 0 ; i <= lastRowNum ; i++){
            Row row = null;
            row = sheet.getRow(i);
            if( row != null ){
                Cell cell = null;
                if(i == 0){
                    cell = row.getCell(0);
                    cell.getStringCellValue();
                }else{
                    cell = row.getCell(0);
                    int cellValue = (int)cell.getNumericCellValue();
                    cell = row.getCell(2);
                    String cellValue2 = cell.getStringCellValue();
                    map.put(cellValue,cellValue2);
                }
            }
        }
        System.out.println("随机点名开始，请老师输入要点名的人数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > map.size()){
            System.out.println("不好意思，请不要输入大于"+map.size()+"的数字");
        }
        Set<Integer> set = new HashSet<Integer>();
        while(set.size()!= num){
            int num2 = (int)(Math.random()*map.size()+1);
            set.add(num2);
        }
        for(Integer hao : set){
            System.out.println("随机抽查的序号为:  "+hao+"，  名字是:  "+map.get(hao));
        }
    }
    public static Sheet getSheetByNum(Workbook book,int number){
        Sheet sheet = null;
        try {
            sheet = book.getSheetAt(number);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return sheet;
    }
    public static Workbook getExcelWorkbook(String filePath) throws IOException, IOException {
        Workbook book = null;
        File file  = null;
        FileInputStream fis = null;

        try {
            file = new File(filePath);
            if(!file.exists()){
                throw new RuntimeException("文件不存在");
            }else{
                fis = new FileInputStream(file);
                book = WorkbookFactory.create(fis);
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            if(fis != null){
                fis.close();
            }
        }
        return book;
    }
}
