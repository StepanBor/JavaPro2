package com.gmail.stepan1983.Controllers;

import com.gmail.stepan1983.model.Client;
import com.gmail.stepan1983.model.DataTableRequestEntity;
import com.gmail.stepan1983.model.TableRestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MyRestController {


    @RequestMapping(value = "/datatable", method = RequestMethod.GET)
    public void getDataTable(@RequestParam(required = false, defaultValue = "0") Integer draw,
                                             @RequestParam(required = false, defaultValue = "0") Integer Start,
                                             @RequestParam(required = false, defaultValue = "0") Integer length,
                                             @RequestParam(required = false, defaultValue = "", name = "search[value]") String searchVakue,
                                             @RequestParam(required = false, name = "search[regex]") Boolean isRegExUsed,
                                             @RequestParam(required = false, defaultValue = "", name = "search[value]") String searchValue,
                                             @RequestParam(required = false, name = "order[][column]") Integer[] orderColumns,
                                             @RequestParam(required = false, name = "order[][dir]") String[] orderDir,
                                             @RequestParam(required = false, name = "columns[][data]") String[] columnsData,
                                             @RequestParam(required = false, name = "columns[][name]") String[] columnsName,
                                             @RequestParam(required = false, name = "columns[][searchable]") Boolean[] isSearchable,
                                             @RequestParam(required = false, name = "columns[][orderable]") Boolean[] isOrderable,
                                             @RequestParam(required = false, name = "columns[][search][value]") String[] searchColValue,
                                             @RequestParam(required = false, name = "columns[][search][regex]") Boolean[] isSearchRegex
                                             ) {
        for (String data : columnsData) {
            System.out.println(data+"WWWWWWWWWWWWWW");
        }

    }

//    @RequestMapping(value = "/datatable", method = RequestMethod.POST)
//    public ResponseEntity<Void> showRequest (@RequestBody DataTableRequestEntity dataTableRequestEntity){
//        System.out.println(dataTableRequestEntity);
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
}
