package net.yasite.api;

import net.yasite.api.params.BaseHttpParam;
import net.yasite.entity.ProductEntity;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import android.content.Context;

public class ProductAPI extends BaseAPI {

	public ProductAPI(Context context, BaseHttpParam pm) {
		super(context, pm);
		// TODO Auto-generated constructor stub
		setMethod("http://114.215.104.230/appios/merchant/Product?category=");
	}

	@Override
	public Object handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		return new Gson().fromJson(json.toString(), ProductEntity.class);
	}

}
