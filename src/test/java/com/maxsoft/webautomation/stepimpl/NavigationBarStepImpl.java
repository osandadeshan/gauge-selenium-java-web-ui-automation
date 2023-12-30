package com.maxsoft.webautomation.stepimpl;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;

import static com.maxsoft.webautomation.common.constant.ApplicationConstants.APPLICATION_URL;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Project Name    : gauge-java-web-ui-automation-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 29/12/23
 * Time            : 10:20 PM
 * Description     :
 **/

public class NavigationBarStepImpl extends BaseStepImpl {
    @Step("The navigation bar option should route to the following URLs <table>")
    public void checkNavigationBarOptionRouting(Table table) {
        for (TableRow row : table.getTableRows()) {
            assertEquals(
                    APPLICATION_URL.concat(row.getCell(table.getColumnName(1))),
                    pages().getNavigationBar()
                            .getNavigationOptionElement(
                                    row.getCell(table.getColumnName(0))
                            )
                            .getAttribute("href")
            );
        }
    }
}
