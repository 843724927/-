package net.yasite.api;

import net.yasite.api.params.BaseHttpParam;
import net.yasite.api.params.SecondCatParam;
import net.yasite.entity.SecondCatEntity;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import android.content.Context;

public class SecondCatAPI extends BaseAPI {

	public SecondCatAPI(Context context, SecondCatParam pm) {
		super(context, pm);
		// TODO Auto-generated constructor stub
		setMethod("http://114.215.104.230/appios/merchant/SecondCat?pid="+pm.getPid());
	}

	@Override
	public Object handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		return new Gson().fromJson(json.toString(),SecondCatEntity.class);
	}

}
