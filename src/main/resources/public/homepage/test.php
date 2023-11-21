<?php
session_start();
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style1.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="mapstyle.css">
    <link rel="stylesheet" href="station.css">
</head>

<body>

    <div class="grid">
        <div class="sidebar con">
            <div class="logo">
                <a href="">
                    <img src="logo.png" alt="">
                </a>
            </div>

            <div class="loginbox">
                <a href="login.php">Login</a>
            </div>
            <ul>
                <li>
                    <a href="">
                        <i class="bi bi-geo-alt-fill"></i>
                        <span>View map</span>
                    </a>
                </li>
                <li>
                    <a href="">
                        <i class="bi bi-calendar2-week-fill"></i>
                        <span>Booking</span>
                    </a>
                </li>
                <li>
                    <a href="Station.html">
                        <i class="bi bi-ev-station"></i>
                        <span>Station</span>
                    </a>
                </li>
                <li>
                    <h3>Contact us</h3>
                </li>
                <li>
                    <a href="">
                        <i class="fa-solid fa-phone"></i>
                        <span>Support</span>
                    </a>
                </li>
                <li>
                    <a href="">
                        <i class="fa-solid fa-bug"></i>
                        <span>Report issue</span>
                    </a>
                </li>
                <li>
                    <a href="">
                        <i class="fa-solid fa-star"></i>
                        <span>Ratting</span>
                    </a>
                </li>
            </ul>
        </div>

        <div class="navbar con">
            <div class="map">
                <span><a href="">Map</a></span>
            </div>

            <div class="station">
                <span><a href="">Station</a></span>
            </div>

            <div class="searchcontainer">
                <div id="search-wrapper">
                    <input type="text" id="search" placeholder="Place,Postcode">
                    <button id="search-button"><a href=""><i class="search-icon fas fa-search"></i></a></button>
                </div>
            </div>
        </div>

        <div class="content con">
            <?php if (isset($_SESSION['success'])) : ?>
                <div class="success">
                    <h3>
                        <?php
                        echo $_SESSION['success'];
                        unset($_SESSION['success']);
                        ?>
                    </h3>
                </div>
            <?php endif ?>

            <!-- logged in user information -->
            <?php if (isset($_SESSION['username'])) : ?>
                <p>Welcome <strong><?php echo $_SESSION['username']; ?></strong></p>
                <p><a href="index.php?logout='1'" style="color: red;">Logout</a></p>
            <?php endif ?>
        </div>
    </div>

</body>

</html>
