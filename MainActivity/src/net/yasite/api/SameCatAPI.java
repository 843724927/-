package net.yasite.api;

import net.yasite.api.params.BaseHttpParam;
import net.yasite.api.params.SameCatParams;
import net.yasite.entity.SameCatEntity;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import android.content.Context;

public class SameCatAPI extends BaseAPI {

	public SameCatAPI(Context context, SameCatParams pm) {
		super(context, pm);
		// TODO Auto-generated constructor stub
		setMethod("http://114.215.104.230/appios/merchant/SameCat?category="+pm.getCategory());
	}

	@Override
	public Object handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		return new Gson().fromJson(json.toString(),SameCatEntity.class);
	}

}
