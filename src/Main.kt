import Kotlin.Person

fun main() {


//     1: khai báo biến
//     từ khóa dùng khai báo biến: var, val
//
//     var: sử dụng cho biến có thể thay đổi giá trị (mutable)
//    var name: String = "Nguyễn Ngọc Kỳ"
//    name = "Nguyễn Ngọc Kỳ đang học Android"
//
//     val: sử dụng cho biến không gán lại được giá trị (immutable)
//    val phone: String = "0963159551"
//
//     phương thức in
//    println(name)
//
//     2: kiểu dữ liệu
//     Basic type: Kiểu dữ liệu cơ bản
//    ReferenceType: Kiểu dữ liệu vùng nhớ
//
//    var name: String = "nguyễn ngọc kỳ"
//    var age: Int = 30
//    var height: Float = 1.65f
//    var weight: Double = 70.5
//    var isMale: Boolean = true
//
//     quy tắc đặt tên
//    camelcase (biến , phương thức)
//     a. nếu == 1 từ: name. age. address
//     b. nếu ≥ 2: doSomething, displayMap, makeDisplayOnview
//     2: pascalcase (Class và tên file): Person, Aminal, CategoryClass, UserClass
//     3: Underscore (file thuộc web hoăc backend) : refresh_token, button_navigate
//
//     3: câu điều kiện ( if else)
//     Biểu thức so sánh trả về giá trị kiểu Boolean
//     1. lớn hơn: a>b
//     2. nhỏ hơn: a<b
//     3. bằng hơn: a == b
//     4. lớn hơn băng: a >= b <=> ( a > b || a == b)
//     5. bé hơn bằng: a <= b <=> ( a < b || a == b)
//
//     Toán tử logic
//     1. && thỏa tất cả điều kiện mới trả về true
//     2. || tất cả điều kiện là false thì mới trả về false
//     3. ! phủ định của điều kiện

//    val a = 5
//    val b = 10
//
//    if (a > b) {
//        println("A lớn hơn B")
//    } else if (a < b) {
//        println("A bé hơn B")
//    } else {
//        println("A bằng B")
//    }
//
//     ví dụ tính chỉ số BMI
//    val height = 1.65f // đơn vị tính là m
//    val weight = 70.5 // đơn vị tính là kg
//    val BMI = ( height / (height * height))
//
//     output: thuộc phân loại nào
//     Code convention
//     https://en.wikipedia.org/wiki/List_of_Unicode_characters
//     if (BMI < 18.5) {
//        println("cân nặng thấp (gầy)")
//    } else if (BMI <= 24.9) {
//        println("bình thường")
//    } else if (BMI <= 29.9) {
//        println("tiền béo phì")
//    } else if (BMI <= 34.9) {
//        println("béo phì")
//    }
//
//     Toán tử 3 ngôi
//    val message = if (BMI < 18.5) {
//        println("cân nặng thấp gầy")
//    } else if (BMI <= 24.9) {
//        println("bình thường")
//    } else {
//        println("không xác định")
//    }
//
//     4: câu điều kiện ( when giống với switch case)
//    val month = 3
//    val message = when (month) {
//        in 1..3 -> {
//            println("quý 1")
//        }
//        in 4..6 -> {
//            println("quý 2")
//        }
//        in 7..9 -> {
//            println("quý 3")
//        }
//        in 10..12 -> {
//            println("quý 4")
//        }
//        else -> println("không xác định")
//    }
//
//     5: Vòng lặp for (duyệt dữ liệu trong một khoảng nào đó)
//    for (value in 100 downTo 1) {
//     1. chỉ in ra số chẵn
//    solution: số chia hết cho 2
//    if (value % 2 == 0) {
//        println(value)
//    }
//
//     2. ch in ra số lẻ
//     solution: số chia hết cho 2 dư 1
//    if (value % 2 == 1) {
//        println(value)
//    }
//
//     3: chỉ in ra số chia 3 dư 1
//    if (value % 3 == 1) {
//        println(value)
//    }
//
//     println(value)
//    }
//
//     Kiểm tra số nguyên tố
//
//    var number = 408
//    var isprime = true
//
//    if (number < 2) {
//        println("không phải là số nguyên tố")
//    } else {
//        for (value in 2..<number) {
//    if (number % value == 0) {
//     ước thứ 3 xuất hiện
//                isprime = false
//        }
//           if (isprime) {
//              println("là số nguyên tố")
//          } else {
//            println("không phải là số nguyên tố")
//         }
//      }
//    }
//
//     6: Hàm lập while
//    var index = 0
//    while (index <= 10) {
//      var tmpIndex =index
//      index += 1
//      if (index == 2) {
//          continue
//      }
//      println (tmpIndex)
//     in tất cả các số
//     chỉ bỏ qua nếu index = 2
//    val tmpIndex = index
//    index += 1
//    if (index == 2) {
//       continue
//    }
//     }
//
//    chuyển sang for
//    for (value in 0..10) {
//    if (value == 2) continue
//    }
//    println(value)
//    }

//     7: toán tử
//    var a = 10
//    var b = 10
//    var total = a + b

//     có bao nhiêu cách tăng giá trị của a lên 1
//     cách 1: a = a + 1
//     cách 2: a += 1
//     cách 3: a++
//     cách 4:

//     ví dụ toán tử
//    var a = 10
//    var b = a++
//    println("A" +a)
//    println("B" +b)
//
//     ví dụ toán tử 2
//    var a = 10
//    var b = 5
//
//    var result = a-- + b-- + --b + a++ - --b + b-- + a--
//    10 + b-- + --b + a++ - --b + b-- + a-- ; a = 9 ; b = 5
//    10 + 5 + --b + a++ - --b + b-- + a-- ; a = 9 ; b = 4
//    10 + 5 + 3 + a++ - --b + b-- + a-- ; a = 9 ; b = 3
//    10 + 5 + 3 + 9 - --b + b-- + a-- ; a = 10 ; b = 3
//    10 + 5 + 3 + 9 - 2 + b-- + a-- ; a = 10 ; b = 2
//    10 + 5 + 3 + 9 - 2 + 2 + a-- ; a = 10 ; b = 1
//    10 + 5 + 3 + 9 - 2 + 2 + 10 ; a = 9 ; b = 1
//
//     a = ?
//     b = ?
//     result = ?

//    println(a)
//    println(b)
//    println(result)


    // Class và object ( Instance )
    // Coi thêm giải thích về solid

    // khởi tạo object
    var teo: Person = Person( "teo", 3, "quận 10")
    teo.address = "quận 10"
    teo.name = "Nguyễn văn teo"
    teo.age = 3

}







