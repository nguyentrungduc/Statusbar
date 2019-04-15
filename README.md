# Statusbar
<img src="img/image1.png" height="300"/>

- Từ phiên bản Android KitKat (4.4), Google đã cho phép chúng tôi hỗ trợ status bar transparent, tuyệt vời nhất từng được tìm kiếm trong nhiều năm trong SDK chính thức.

- Và bây giờ trong theme material mới của Lollipop với một số control UI và kết hợp màu sắc đẹp mắt, chúng tôi thực sự có thể tận dụng tối đa tính năng thú vị đó.

- Status bar transparent này thường được sử dụng với navigation drawer dường như bên dưới status bar. Ngoài ra đối vovới hình ảnh trên đầu và bố trí điều phối viên, statusbar transparent giờ đây đã trở thành một công cụ UI tiêu chuẩn.

- Ở đây tôi sẽ trình bày cách bạn có thể thực hiện giao diện tương tự trong ứng dụng của mình cho các thiết bị chạy phiên bản Android 4.4 trở lên.

- Trước hết, vì status bar này chỉ được hỗ trợ trong phiên bản 4.4 trở lên, chúng ta cần tạo một thư mục value-v19 .

- Vì vậy, tạo một thư mục mới trong thư mục res của bạn dưới dạng value-v19.

- Trong value-V19 , sao chép giá trị bình thường của bạn styles.xml mà là có chủ đề bình thường của bạn trong đó.

Ví dụ: sau đây có thể là chủ đề của bạn:

normal_style.jpg

- Chủ đề ở trên này sẽ nằm trong tệp style.xml bình thường của bạn , là thư mục giá trị bình thường. Ở đây, NoActionBar có nghĩa là bạn sẽ không có tiêu đề trong hoạt động của mình. Vui lòng sử dụng thanh công cụ mới và sau đó đặt nó làm thanh hành động của hoạt động.

- Đoạn code sau giải thích cách đặt thanh công cụ làm thanh hành động:

thanh công cụ_activity.jpg

- Điều này sẽ đặt thanh công cụ mới như một thanh hành động. Bây giờ, đến điểm chính của chúng tôi là làm thế nào chúng ta có thể đặt thanh trạng thái mờ trên thanh công cụ.

- Tôi hy vọng bạn đã sao chép thư mục giá trị thông thường style.xml trong thư mục mới value-v19. 

- Trong này styles.xml mà bạn đã sao chép trong các giá trị-V19 , xác định các chủ đề như sau:

transculent_statusbar.jpg

- Ở đây, trong đoạn trích trên, -> android:windowTranslucentStatus -> làm status bar transparent

- Trong bố trí hoạt động vùng chứa của bạn, đừng quên đặt fitSystemWindow =, đúng true, cho bố cục chính và cho thanh công cụ và các chế độ xem nội bộ khác mà bạn muốn UI phù hợp với cửa sổ hệ thống. Đó là một cách sử dụng khá phổ biến cho hoạt động ngăn kéo và hoạt động chi tiết với bố trí điều phối viên.

- Sau khi áp dụng các thay đổi ở trên, cuối cùng bạn sẽ có được bố cục như bên dưới:
- Để áp dụng điều tương tự cho Lollipop, chỉ cần sao chép thư mục của value-v19 và dán vào giá trị-v21 trong đó bạn cũng có thể thực hiện một số thay đổi cụ thể cho phiên bản Lollipop .

- Điều cuối cùng là đừng quên thiết lập chủ đề này trong hoạt động của bạn mà bạn muốn đặt hiệu ứng tuyệt vời này của thanh trạng thái trong suốt.

