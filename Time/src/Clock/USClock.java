package Clock;

public class USClock extends Clock {
	
	private String periodIndicator;
	
		
		public String getPeriodIndicator() {
			return periodIndicator;
		}
		
		public void setAfterMidDay() {
				this.periodIndicator = "PM";
		}
		
		public void setBeforeMidDay() {
			this.periodIndicator = "AM";
		}
		
		public void setHour(int hour) {
			
		setBeforeMidDay();
		if(hour >= 12 && hour <= 23) {
			this.periodIndicator = "PM";
			this.hour = hour - 12;
		} else if(hour >= 24) {
			hour = 0;
		} else {
			this.hour = hour;
		}
	}
	


	@Override
	public Clock convert(Clock clock) {
		return null;
	}

}
