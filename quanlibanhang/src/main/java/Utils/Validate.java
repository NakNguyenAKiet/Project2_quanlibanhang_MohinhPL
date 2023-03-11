package Utils;

public class Validate {
    
/*  Category:
        name: Kiểm tra xem tên danh mục có tồn tại hay không, có độ dài phù hợp hay không.
        description: Kiểm tra xem mô tả có độ dài phù hợp hay không.
*/    
    public boolean validateCategoryName(String name) {
        return name != null && name.length() >= 2 && name.length() <= 50;
    }

    public boolean validateCategoryDescription(String description) {
        return description != null && description.length() <= 200;
    }

/*  Customer:
        password: Kiểm tra độ dài mật khẩu và độ mạnh của mật khẩu (bao gồm chữ hoa, chữ thường, số, ký tự đặc biệt, ...).
        fullname: Kiểm tra xem tên khách hàng có độ dài phù hợp hay không.
        address: Kiểm tra độ dài địa chỉ khách hàng.
        city: Kiểm tra xem tên thành phố có độ dài phù hợp hay không.
*/
    
    public boolean validateCustomerPassword(String password) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
        return password.matches(regex);
    }

    public boolean validateCustomerFullname(String fullname) {
        return fullname != null && fullname.length() >= 2 && fullname.length() <= 50;
    }

    public boolean validateCustomerAddress(String address) {
        return address != null && address.length() <= 200;
    }

    public boolean validateCustomerCity(String city) {
        return city != null && city.length() >= 2 && city.length() <= 50;
    }
    
/*  Order:
        customerId: Kiểm tra xem khách hàng có tồn tại trong database hay không.
        date: Kiểm tra xem ngày đặt hàng có hợp lệ hay không (ví dụ: không được trong tương lai).
        total: Kiểm tra giá trị đơn hàng có phù hợp hay không.
        note: Kiểm tra độ dài ghi chú đơn hàng.
*/    
    
    
/*  OrderDetail:
        orderId: Kiểm tra xem đơn hàng có tồn tại trong database hay không.
        vegetableId: Kiểm tra xem sản phẩm có tồn tại trong database hay không.
        quantity: Kiểm tra số lượng sản phẩm có hợp lệ hay không.
        price: Kiểm tra giá tiền sản phẩm có hợp lệ hay không.
*/

/*  Vegetable:
        categoryId: Kiểm tra xem danh mục sản phẩm có tồn tại trong database hay không.
        vegetableName: Kiểm tra xem tên sản phẩm có độ dài phù hợp hay không.
        unit: Kiểm tra đơn vị tính có độ dài phù hợp hay không.
        amount: Kiểm tra số lượng sản phẩm có hợp lệ hay không.
        image: Kiểm tra xem tên file hình ảnh sản phẩm có hợp lệ hay không.
        price: Kiểm tra giá tiền sản phẩm có hợp lệ hay không.
*/
    
}
