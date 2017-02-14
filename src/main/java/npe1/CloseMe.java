import java.sql.*;

public class CloseMe {

    /**
     * close prepared statements if not null
     *
     * @throws SQLException
     */
    public static void endQueryDatabase()
            throws SQLException {
        // prepared statements
        if (pstmtWarnAddress != null) {
            pstmtWarnAddress.close();
        }
        if (pstmtCountW1StatusForOrder != null) {
            pstmtCountW1StatusForOrder.close();
        }
        if (pstmtDirectDeliveryTest != null) {
            pstmtDirectDeliveryTest.close();
        }
        // resultset for order loop
        if (rsOrdersForProcessing != null) {
            rsOrdersForProcessing.close();
        }
        if (pstmtSelectOrdersForProcessing != null) {
            pstmtSelectOrdersForProcessing.close();
        }
        if (pstmtPaidOrderSum != null) {
            pstmtPaidOrderSum.close();
        }
        if (pstmtOrderBalance != null) {
            pstmtOrderBalance.close();
        }
        if (pstmtProductCount != null) {
            pstmtProductCount.close();
        }
        if (pstmtUpdatePaymentOrder != null) {
            pstmtUpdatePaymentOrder.close();
        }
        if (pstmtUpdatePaymentKontoeintrag != null) {
            pstmtUpdatePaymentKontoeintrag.close();
        }
        if (pstmtSelectOrderCount != null) {
            pstmtSelectOrderCount.close();
        }
        if (pstmtSelectOrdersPaidWithin6WeeksByB != null) {
            pstmtSelectOrdersPaidWithin6WeeksByB.close();
        }
        if (pstmtSelectPerfectHistory != null) {
            pstmtSelectPerfectHistory.close();
        }
        if (pstmtSelectProfile != null) {
            pstmtSelectProfile.close();
        }
        if (pstmtUpdateOrderStatus != null) {
            pstmtUpdateOrderStatus.close();
        }
        if (pstmtUpdateOrderBooking != null) {
            pstmtUpdateOrderBooking.close();
        }
        if (pstmtSelectDoublets != null) {
            pstmtSelectDoublets.close();
        }
        if (pstmtSelectAccountBalance != null) {
            pstmtSelectAccountBalance.close();
        }
        if (pstmtSelectCountWarnings != null) {
            pstmtSelectCountWarnings.close();
        }
        if (pstmtUpdateOrderWarning != null) {
            pstmtUpdateOrderWarning.close();
        }
        if (pstmtSelectWarningAttributeCustomer != null) {
            pstmtSelectWarningAttributeCustomer.close();
        }
        if (pstmtSelectWarningAttributeZipcode != null) {
            pstmtSelectWarningAttributeZipcode.close();
        }
        if (pstmtSelectWarningAttributeStreet != null) {
            pstmtSelectWarningAttributeStreet.close();
        }
        if (pstmtSelectWarningAttributeLastname != null) {
            pstmtSelectWarningAttributeLastname.close();
        }
        if (pstmtSelectRLS != null) {
            pstmtSelectRLS.close();
        }
        if (pstmtSelectFirstOrderBankdraft != null) {
            pstmtSelectFirstOrderBankdraft.close();
        }
        if (pstmtSelectOpenFirstOrder != null) {
            pstmtSelectOpenFirstOrder.close();
        }
        if (pstmtHasOpenHistoryEntry != null) {
            pstmtHasOpenHistoryEntry.close();
        }

    }

    // prepared statements
    private static PreparedStatement pstmtSelectOrdersForProcessing;  
    private static PreparedStatement pstmtDirectDeliveryTest;
    private static PreparedStatement pstmtWarnAddress;
    private static PreparedStatement pstmtCountW1StatusForOrder;
    private static PreparedStatement pstmtPaidOrderSum;
    private static PreparedStatement pstmtOrderBalance;
    private static PreparedStatement pstmtProductCount;
    private static PreparedStatement pstmtUpdatePaymentOrder;
    private static PreparedStatement pstmtUpdatePaymentKontoeintrag;
    private static PreparedStatement pstmtSelectOrderCount;
    private static PreparedStatement pstmtSelectOrdersPaidWithin6WeeksByB;
    private static PreparedStatement pstmtSelectPerfectHistory;
    private static PreparedStatement pstmtSelectProfile;
    private static PreparedStatement pstmtUpdateOrderStatus;
    private static PreparedStatement pstmtUpdateOrderBooking;
    private static PreparedStatement pstmtSelectDoublets;
    private static PreparedStatement pstmtSelectAccountBalance;
    private static PreparedStatement pstmtSelectCountWarnings;
    private static PreparedStatement pstmtSelectWarningAttributeZipcode;
    private static PreparedStatement pstmtSelectWarningAttributeStreet;
    private static PreparedStatement pstmtSelectWarningAttributeLastname;
    private static PreparedStatement pstmtSelectWarningAttributeCustomer;
    private static PreparedStatement pstmtUpdateOrderWarning;
    private static PreparedStatement pstmtSelectRLS;
    private static PreparedStatement pstmtSelectFirstOrderBankdraft;
    private static PreparedStatement pstmtSelectOpenFirstOrder;
    private static PreparedStatement pstmtHasOpenHistoryEntry;

}
