package hovers;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoversTest extends BaseTest {
    @Test
    public void tesHoverUser1(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        assertEquals(caption.getTitle(),"name: user1", "Caption title incorrect");
        assertEquals(caption.getTextOfLink(),"View profile","Caption link text incorrect" );
        assertTrue(caption.getLink().endsWith("/users/1"),"Link Incorrect");
    }
}
