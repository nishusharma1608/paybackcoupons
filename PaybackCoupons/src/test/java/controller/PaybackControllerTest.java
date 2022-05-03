package controller;

import java.awt.PageAttributes.MediaType;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

import data.Coupon;

//@SpringBootTest(classes=PaybackController.class)
//@RunWith(SpringRunner.class)
@AutoConfigureMockMvc

public class PaybackControllerTest {
    @Autowired
    MockMvc mockMvc;
    
    @MockBean
    PaybackController paybackController;
    
    SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
    
    Coupon c1 = new Coupon(1,sd.parse("2022-03-06", new ParsePosition(0)), sd.parse("2022-09-06", new ParsePosition(0)),111);
    Coupon c2 = new Coupon(2,sd.parse("2022-04-07", new ParsePosition(0)), sd.parse("2022-10-07", new ParsePosition(0)),111);
    
    
    //@Test
    public void getMemberCoupons_success() throws Exception {
        List<Coupon> records = new ArrayList<>(Arrays.asList(c1, c2));
        
        Mockito.when(paybackController.getMemberCoupons(111)).thenReturn(
        		new ResponseEntity<List<Coupon>>(records, HttpStatus.OK));
        
        mockMvc.perform(MockMvcRequestBuilders
                .get("/getMemberCoupons/111")
                .contentType(APPLICATION_JSON));
    }  
    
}