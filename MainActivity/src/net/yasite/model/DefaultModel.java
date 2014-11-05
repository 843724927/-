package net.yasite.model;

import net.yasite.entity.ShareEntity;
import net.yasite.service.DefaultService;
import android.content.Context;

public class DefaultModel extends Model {
	private DefaultService Share;
	public DefaultModel(Context context){
		this.context = context;
		Share = new DefaultService(context);
	}
	public ShareEntity requestShareEntity(String id){
		return Share.getShareEntity(id);
	}
}
