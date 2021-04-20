package com.el.excel.reptile.core.support;

import com.alibaba.excel.metadata.CellData;
import com.alibaba.excel.metadata.Head;
import com.alibaba.excel.write.handler.CellWriteHandler;
import com.alibaba.excel.write.metadata.holder.WriteSheetHolder;
import com.alibaba.excel.write.metadata.holder.WriteTableHolder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.util.List;

/**
 * 自定义读取器 <br/>
 * since 2021/2/7
 *
 * @author eddie.lys
 */
public class CustomWriteEventListener implements CellWriteHandler {

    @Override
    public void beforeCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Row row, Head head, Integer integer, Integer integer1, Boolean aBoolean) {

    }

    @Override
    public void afterCellCreate(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, Cell cell, Head head, Integer integer, Boolean aBoolean) {

    }

    @Override
    public void afterCellDataConverted(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, CellData cellData, Cell cell, Head head, Integer integer, Boolean aBoolean) {

    }

    @Override
    public void afterCellDispose(WriteSheetHolder writeSheetHolder, WriteTableHolder writeTableHolder, List<CellData> list, Cell cell, Head head, Integer relativeRowIndex, Boolean isHead) {
//        if (!isHead && cell.getColumnIndex() == 1 && cell.getStringCellValue().contains("个")) {
//            Workbook workbook = writeSheetHolder.getSheet().getWorkbook();
//            CellStyle cellStyle = workbook.createCellStyle();
//            Font cellFont = workbook.createFont();
//            cellFont.setBold(true);
//            cellStyle.setFont(cellFont);
//            cell.setCellStyle(cellStyle);
//        }
    }
}
