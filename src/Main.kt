import javax.lang.model.type.ReferenceType

fun main() {

    // 1: khai báo biến
    // từ khóa dùng khai báo biến: var, val

    // var: sử dụng cho biến có thể thay đổi giá trị (mutable)
    //var name: String = "Nguyễn Ngọc Kỳ"
    //name = "Nguyễn Ngọc Kỳ đang học Android"

    // val: sử dụng cho biến không gán lại được giá trị (immutable)
    //val phone: String = "0963159551"

    // phương thức in
    //println(name)

    // 2: kiểu dữ liệu
    // Basic type: Kiểu dữ liệu cơ bản
    //ReferenceType: Kiểu dữ liệu vùng nhớ

    var name: String = "nguyễn ngọc kỳ"
    var age: Int = 30
    var height: Float = 1.65f
    var weight: Double = 70.5
    var isMale: Boolean = true

    // quy tắc đặt tên
    //camelcase (biến , phương thức)
    // a. nếu == 1 từ: name. age. address
    // b. nếu ≥ 2: doSomething, displayMap, makeDisplayOnview
    // 2: pascalcase (Class và tên file): Person, Aminal, CategoryClass, UserClass
    // 3: Underscore (file thuộc web hoăc backend) : refresh_token, button_navigate

}
