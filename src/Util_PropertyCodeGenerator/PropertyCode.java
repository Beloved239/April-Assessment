package Util_PropertyCodeGenerator;

public class PropertyCode {
    private static int lastApartmentCode;
    private static int lastHouseCode;
    private static int lastCondoCode;

    public static String generatePropertyCode(String propertyType) {
        String codePrefix = "";
        int lastCode = 0;

        switch (propertyType) {
            case "Apartment" -> {
                codePrefix = "APA";
                lastCode = lastApartmentCode;
            }
            case "House" -> {
                codePrefix = "HOU";
                lastCode = lastHouseCode;
            }
            case "Condo" -> {
                codePrefix = "CON";
                lastCode = lastCondoCode;
            }
            default -> throw new IllegalArgumentException("Invalid property type: " + propertyType);
        }

        String codeSuffix = String.format("%04d", lastCode + 1);
        String propertyCode = codePrefix + codeSuffix;

        switch (propertyType) {
            case "Apartment" -> lastApartmentCode++;
            case "House" -> lastHouseCode++;
            case "Condo" -> lastCondoCode++;
        }

        return propertyCode;
    }

}

