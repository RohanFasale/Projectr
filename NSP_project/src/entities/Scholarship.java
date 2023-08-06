package entities;

public class Scholarship {
	private String aadharNumber;
	private String NTSC;
	private String Pragati;
	private String PMS;
	
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getNTSC() {
		return NTSC;
	}
	public void setNTSC(String nTSC) {
		NTSC = nTSC;
	}
	public String getPragati() {
		return Pragati;
	}
	public void setPragati(String pragati) {
		Pragati = pragati;
	}
	public String getPMS() {
		return PMS;
	}
	public void setPMS(String pMS) {
		PMS = pMS;
	}
	@Override
	public String toString() {
		return "Scholarship [aadharNumber=" + aadharNumber + ", NTSC=" + NTSC + ", Pragati=" + Pragati + ", PMS=" + PMS
				+ "]";
	}
	
	
}
