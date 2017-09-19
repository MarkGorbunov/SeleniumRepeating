package util;

import static org.testng.Assert.fail;

import java.util.List;

public class VerifyHelper
{

    static public Boolean linksContainsText(List<String> linksText, String textForCheck) {
        for (String text : linksText)
        {
            if (!text.contains(textForCheck.toLowerCase()))
            {
                return false;
            }
        }
        return true;
    }
}
