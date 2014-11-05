package net.yasite.api;

import net.yasite.api.params.BaseHttpParam;
import net.yasite.api.params.ShareParams;
import net.yasite.entity.ShareEntity;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import android.content.Context;

public class ShareAPI extends BaseAPI {

	public ShareAPI(Context context, ShareParams pm) {
		super(context, pm);
		setMethod("http://114.215.104.230/appios/default/Share?id="+pm.getId());
	}

	@Override
	public Object handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		return new Gson().fromJson(json.toString(),ShareEntity.class);
	}

}
