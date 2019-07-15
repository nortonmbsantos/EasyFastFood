package easyfastfood.framework;

/**
 *
 * @author norto
 */
public class StandardizedDataResult {
    private String message;
    private int id;
    private boolean validation;
    private String extra;

    public StandardizedDataResult(String message, int id, boolean validation) {
        this.message = message;
        this.id = id;
        this.validation = validation;
    }

    public StandardizedDataResult(String message, int id, boolean validation, String extra) {
        this.message = message;
        this.id = id;
        this.validation = validation;
        this.extra = extra;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isValidation() {
        return validation;
    }

    public void setValidation(boolean validation) {
        this.validation = validation;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
    
    

}
