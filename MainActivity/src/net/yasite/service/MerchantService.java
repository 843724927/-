package net.yasite.service;

import net.yasite.api.BaseAPI;
import net.yasite.api.FirstCatAPI;
import net.yasite.api.ProductAPI;
import net.yasite.api.SameCatAPI;
import net.yasite.api.SecondCatAPI;
import net.yasite.api.ThirdCatAPI;
import net.yasite.api.params.ProductParam;
import net.yasite.api.params.SameCatParams;
import net.yasite.api.params.SecondCatParam;
import net.yasite.api.params.ThirdCatParam;
import net.yasite.entity.FirstCatEntity;
import net.yasite.entity.ProductEntity;
import net.yasite.entity.SameCatEntity;
import net.yasite.entity.SecondCatEntity;
import net.yasite.entity.ThirdCatEntity;
import android.content.Context;

public class MerchantService extends BaseService {
	private BaseAPI api;
	public MerchantService(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	public FirstCatEntity getFirstCatEntity(){
		api = new FirstCatAPI(context);
		try {
			if(api.doGet()){
				return (FirstCatEntity) api.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	public SameCatEntity getSameCatEntity(String category){
		SameCatParams pm = new SameCatParams();
		pm.setCategory(category);
		api = new SameCatAPI(context, pm);
		try {
			if(api.doGet()){
				return (SameCatEntity) api.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	public SecondCatEntity  getSecondCatEntity(String pid){
		SecondCatParam pm = new SecondCatParam();
		pm.setPid(pid);
		api = new SecondCatAPI(context, pm);
		try {
			if(api.doGet()){
				return (SecondCatEntity) api.getHandleResult();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public ProductEntity getProductEntity(String category){
		ProductParam pm = new ProductParam();
		pm.setCategory(category);
		api = new ProductAPI(context, pm);
		try {
			if(api.doGet()){
				return (ProductEntity) api.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public ThirdCatEntity getThirdCatEntity(String c2){
		ThirdCatParam pm = new ThirdCatParam();
		pm.setC2(c2);
		api = new ThirdCatAPI(context, pm);
		try {
			if(api.doGet()){
				return (ThirdCatEntity) api.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	

}
