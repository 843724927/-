package net.yasite.api;

import net.yasite.api.params.BaseHttpParam;
import net.yasite.entity.FirstCatEntity;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import android.content.Context;

public class FirstCatAPI extends BaseAPI {

	public FirstCatAPI(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		setMethod("http://114.215.104.230/appios/merchant/FirstCat");
	}

	@Override
	public Object handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		return new Gson().fromJson(json.toString(),FirstCatEntity.class);
	}

}
