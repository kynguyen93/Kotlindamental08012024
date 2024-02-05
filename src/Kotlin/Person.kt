package Kotlin

class Person(
    var name: String,
    var age: Int,
    var address: String? = null
    ) {
    // Thuộc tính
    //var name: String = ""
    //var age: Int = 0

    // Phương thức khởi tạo (constructor)
    // Để ràng buộc các tham số cho việc khởi tạo

    // second constructor
    constructor(
        name: String,
        age: Int,
        address: String?,
        height: Float
    ): this(name, age, address) {

    }

    // Tham trị: khi truyền dữ liệu chỉ truyền giá trị
    // sử dụng kiểu dữ liệu nguyên thủy: String, Boolean, Int, Float...

    // Example:
    // var a = 5
    // var b = a
    // khi a gán cho b , a chỉ gán phần giá trị

    // Tham chiếu: khi truền giá trị sẽ truyền địa chỉ
    // sử dụng kiểu Object

    // Example:
    // var teo = Person()
    // var ti = teo
    // khi teo gán cho ti, tèo gán phần địa chỉ cho ti
    // => teo và ti cùng một địa chỉ

    // Hành vi
}