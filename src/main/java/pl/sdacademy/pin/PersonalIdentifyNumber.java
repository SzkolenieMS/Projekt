package pl.sdacademy.pin;

public class PersonalIdentifyNumber implements IPersonalIdentifyNumber {

	@Override
	public boolean validate(String pin, String sex) {
		boolean pinValid = true;
		char[] arrayPin = pin.toCharArray();
		if (pin.length() != 11) {
			pinValid = false;
			System.out.println("Not correct Length");
		}
		if (getSex((int) arrayPin[9]) == sex){
			pinValid = false;
			System.out.println("Wrong sex");
		}
		if (checkSum(arrayPin)){
			System.out.println("Check sum not correct");
			pinValid = false;
		}
			

		return pinValid;
	}

	public String getSex(int pin) {
		if (pin % 2 == 0) {
			return "Mezczyzna";
		} else {
			return "Kobieta";
		}
	}

	private boolean checkSum(char[] pin) {
		int sum = 1 * pin[0] + 3 * pin[1] + 7 * pin[2] + 9 * pin[3] + 1 * pin[4] + 3 * pin[5] + 7 * pin[6] + 9 * pin[7]
				+ 1 * pin[8] + 3 * pin[9];
		int checkPin;
		sum %= 10;
		sum = 10 - sum;
		sum %= 10;
		String pingString= String.valueOf(pin[10]);
		checkPin = Integer.parseInt(pingString);
//		System.out.println("sum " + sum + " checkPin= " + checkPin);
		if (sum == checkPin) {
//			System.out.println("Check sum return true");
			return true;
		} else {
//			System.out.println("Check sum return false");
			return false;
		}
	}

}
