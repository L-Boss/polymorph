package Shopping_Application;

public class Virtual_Product extends Product{
    private String downloadUrl;

    public Virtual_Product(String name, double price, String downloadUrl)
    {
        this.downloadUrl = downloadUrl;
        super(name, price);

    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        print("Product URL: " + downloadUrl);
    }
}
