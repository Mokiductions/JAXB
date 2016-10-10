/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20161006_csv.to.xml.jaxb;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miquel Ginés Borràs
 * @mail ginesborrasm@gmail.com
 */
public class CSVParser {

    public CSVParser() {

    }

    public List loadCSVToArrayList(String csv) {
        List<String> ret = new ArrayList<>();
        String[] splitData = csv.split("\\s*,\\s*");
        for (String data : splitData) {
            if (!(data == null) || !(data.length() == 0)) {
                //ret.add(data);
                ret.add(data.trim());
            }
        }
        return ret;
    }
}
