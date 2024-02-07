package Kotlin

class Person(
    private var name: String,
    private var age: Int,
    private var address: String? = null
    ) {
    // getter và setter
    var height: Float = 0f
        set(value) {
            field = value +1
        }

        get() {
            return field - 3
        }


    // getter và setter

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getAge(): Int {
        return age
        }

    fun setAge( age: Int) {
        this.age = age
    }

    fun getAddress(): String? {
        return address
    }

    fun setAddress(address: String) {
        this.address = address
    }


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