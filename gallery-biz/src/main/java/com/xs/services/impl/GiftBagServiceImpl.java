package com.xs.services.impl;

import com.xs.daos.GiftBagMapper;
import com.xs.beans.GiftBag;
import com.xs.services.GiftBagService;
import com.xs.core.sservice.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;


/**
\* 杭州桃子网络科技股份有限公司
\* User: zhaoxin
\* Date: 2018/10/10
\* To change this template use File | Settings | File Templates.
\* Description:
\*/

@Service("giftBagService")
@Transactional
public class GiftBagServiceImpl extends AbstractService<GiftBag> implements GiftBagService {
    @Autowired
    private GiftBagMapper giftBagMapper;

}
