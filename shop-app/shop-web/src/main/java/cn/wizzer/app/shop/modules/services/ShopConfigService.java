package cn.wizzer.app.shop.modules.services;

import cn.wizzer.framework.base.service.BaseService;
import cn.wizzer.app.shop.modules.models.Shop_config;

public interface ShopConfigService extends BaseService<Shop_config>{
    Shop_config getConfig();
    void clearCache();
}
