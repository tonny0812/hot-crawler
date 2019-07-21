package com.taogen.hotcrawler.crawler;

import com.taogen.hotcrawler.AppTest;
import com.taogen.hotcrawler.crawler.impl.V2exHotProcessor;
import com.taogen.hotcrawler.crawler.impl.ZhihuHotProcessor;
import com.taogen.hotcrawler.entity.Info;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HotProcessorTest extends AppTest
{
    @Autowired
    private V2exHotProcessor v2exHotProcessor;

    @Autowired
    private ZhihuHotProcessor zhihuHotProcessor;

    @Test
    public void getV2exHotInfo()
    {
        List<Info> v2exList = v2exHotProcessor.getHotList();
        Assert.assertNotNull(v2exList);
        Assert.assertTrue(v2exList.size() > 0);
        System.out.println("v2ex hot list size: " + v2exList.size());
    }

    @Test
    public void getZhihuHotInfo()
    {
        List<Info> zhihuList = zhihuHotProcessor.getHotList();
        Assert.assertNotNull(zhihuList);
        Assert.assertTrue(zhihuList.size() > 0);
        System.out.println("zhihu hot list size: " + zhihuList.size());
    }
}