package net.yasite.service;

import net.yasite.api.BaseAPI;
import net.yasite.api.ShareAPI;
import net.yasite.api.params.BaseHttpParam;
import net.yasite.api.params.ShareParams;
import net.yasite.entity.ShareEntity;
import android.content.Context;

public class DefaultService extends BaseService {
	private BaseAPI api;
	public DefaultService(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	public ShareEntity getShareEntity(String id){
		ShareParams pm = new ShareParams();
		pm.setId(id);
		api = new ShareAPI(context, pm);
		try {
			if(api.doGet()){
				return (ShareEntity) api.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
