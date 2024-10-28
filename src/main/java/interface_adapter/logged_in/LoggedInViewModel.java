package interface_adapter.logged_in;

import interface_adapter.ViewModel;

/**
 * The View Model for the Logged In View.
 */
public class LoggedInViewModel extends ViewModel<LoggedInState> {

    private String successMessage;
    private String errorMessage;

    public LoggedInViewModel() {
        super("logged in");
        setState(new LoggedInState());
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
        firePropertyChanged("successMessage");
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        firePropertyChanged("errorMessage");
    }

    public void firePropertyChanged(String propertyName) {
        // Notify listeners about the property change
    }

}
