/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    $(document).ready(function () {

                                $('.po-markup > .po-help').popover({
                                    trigger: 'hover',
                                    html: true, // must have if HTML is contained in popover

                                    // get the title and conent
                                    title: function () {
                                        return $(this).parent().find('.po-title').html();
                                    },
                                    content: function () {
                                        return $(this).parent().find('.po-body').html();
                                    },
                                    container: 'body',
                                    placement: 'right'

                                });

                            });