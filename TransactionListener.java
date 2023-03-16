public interface TransactionListener {

    void onLoading();

    void onComplete(Bank bank);

}
