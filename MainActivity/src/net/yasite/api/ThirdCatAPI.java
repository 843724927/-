package net.yasite.api;

import net.yasite.api.params.BaseHttpParam;
import net.yasite.entity.ThirdCatEntity;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import android.content.Context;

public class ThirdCatAPI extends BaseAPI {

	public ThirdCatAPI(Context context, BaseHttpParam pm) {
		super(context, pm);
		// TODO Auto-generated constructor stub
		setMethod("http://114.215.104.230/appios/merchant/ThirdCat?c2=");
	}

	@Override
	public Object handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		return new Gson().fromJson(json.toString(),ThirdCatEntity.class);
	}

}
