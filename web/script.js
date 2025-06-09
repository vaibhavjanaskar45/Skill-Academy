jQuery(document).ready(function () {

	$('#btn-one').click(function () {
		html2canvas(document.querySelector('#certificateContainer')).then((canvas) => {
			let base64image = canvas.toDataURL('image/png');
			// console.log(base64image);
			let pdf = new jsPDF('p', 'px', [1600, 1131]);
			pdf.addImage(base64image, 'PNG', 135, 50, 870, 470);
			pdf.save('Certificate.pdf');
		});
	});

});