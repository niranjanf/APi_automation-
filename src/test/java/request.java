public class request {
	
//	
//	{
//	    "vin_comp_cd": 1,
//	    "vin_div_cd": 1,
//	    "vin_role_cd": 22,
//	    "vin_for_tab": null
//	}
	
	
	private int  vin_comp_cd ;
	private int  vin_div_cd ;
	
	private String unique_id;
	
	
	public String getUnique_id() {
		return unique_id;
	}

	public void setUnique_id(String unique_id) {
		this.unique_id = unique_id;
	}

	public int getVin_div_cd() {
		return vin_div_cd;
	}

	public void setVin_div_cd(int vin_div_cd) {
		this.vin_div_cd = vin_div_cd;
	}

	public int getVin_role_cd() {
		return vin_role_cd;
	}

	public void setVin_role_cd(int vin_role_cd) {
		this.vin_role_cd = vin_role_cd;
	}

	private int  vin_role_cd ;

	
	
	
	
	public int getvin_comp_cd()
	{
		return vin_comp_cd;
		
		
	}
	
	public void setvin_comp_cd(int vin_comp_cd) {
	    this.vin_comp_cd = vin_comp_cd;
		
		
		
	}

	
	
	
	
	
}